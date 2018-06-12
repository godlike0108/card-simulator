/* 監聽開啟按鈕 */
let openBtn = document.getElementById("openBtn");

openBtn.addEventListener("click", openBtnClick, false);

function openBtnClick(){
    let list = document.getElementById("list");
    list.style.transform = "translateX(-990px)";
}