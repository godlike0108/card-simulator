//
//  ViewController.swift
//  CardGame
//
//  Created by Morris on 2018/6/12.
//  Copyright © 2018 Morris. All rights reserved.
//

import UIKit
import GameplayKit

class ViewController: UIViewController {
    @IBOutlet weak var startCard: UIImageView!
    
    @IBOutlet weak var flashView: UIImageView!
    @IBOutlet weak var coverView: UIView!
    @IBOutlet weak var cardCollectionView: UICollectionView!
    var cardOptions = ["0","1","2","3","4","5","6","7","8","9"]
    let randomCardNumber = GKRandomDistribution(lowestValue: 0, highestValue: 9)
    var runCardNumber = 10
    @IBOutlet weak var myGifView: UIImageView!
    override func viewDidLoad() {
        super.viewDidLoad()
        coverView.isHidden = false
        myGifView.loadGif(name:"glow")
        UIView.animate(withDuration: 2, delay: 0, options: [.autoreverse,.repeat], animations: {
            self.coverView.layer.opacity = 0
        }, completion: nil)

    }
    @IBAction func runPressed(_ sender: UIButton) {
        runCardNumber = randomCardNumber.nextInt()
        cardCollectionView.reloadData()
        let point = CGPoint(x: 9 * 108, y: 0)
        cardCollectionView.setContentOffset(point, animated: true)
        coverView.layer.removeAllAnimations()
        startCard.isHidden = true
        myGifView.isHidden = true
        print(runCardNumber)
    }
}

extension ViewController:UICollectionViewDataSource,UICollectionViewDelegate,UICollectionViewDelegateFlowLayout{
    
    func collectionView(_ collectionView: UICollectionView, numberOfItemsInSection section: Int) -> Int {
        return 10
    }
    func collectionView(_ collectionView: UICollectionView, cellForItemAt indexPath: IndexPath) -> UICollectionViewCell {
        let cell = collectionView.dequeueReusableCell(withReuseIdentifier: "cell", for: indexPath) as! CardCell
        cell.cardImageView.image = UIImage(named: cardOptions[randomCardNumber.nextInt()])
        cell.backgroundColor = .black
        return cell
    }
    
    func collectionView(_ collectionView: UICollectionView, layout collectionViewLayout: UICollectionViewLayout, minimumLineSpacingForSectionAt section: Int) -> CGFloat {
        return 0
        
    }
    func collectionView(_ collectionView: UICollectionView, layout collectionViewLayout: UICollectionViewLayout, minimumInteritemSpacingForSectionAt section: Int) -> CGFloat {
        return 0
    }
    func collectionView(_ collectionView: UICollectionView, layout collectionViewLayout: UICollectionViewLayout, sizeForItemAt indexPath: IndexPath) -> CGSize {
        return CGSize(width: 108, height: 132)
    }
    func scrollViewDidScroll(_ scrollView: UIScrollView) {
        print(scrollView.contentOffset.x)
        let x = scrollView.contentOffset.x
        if x == 9 * 108 {
            flashView.isHidden = false
            UIView.animate(withDuration: 2) {
                self.flashView.layer.opacity = 0
            }
        }
    }
    func scrollViewWillEndDragging(_ scrollView: UIScrollView, withVelocity velocity: CGPoint, targetContentOffset: UnsafeMutablePointer<CGPoint>) {
    }
    
}
