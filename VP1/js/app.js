let likes = 0;
let likes2 = 0;
let likes3 = 0;
function like() {
    document.getElementById("btn-curtir").style.backgroundColor = "#ccc";
    document.getElementById("curtidas").innerHTML=`${likes}curtidas`;

likes++
}

function like2() {
    document.getElementById("btn-curtir2").style.backgroundColor = "#ccc";
    document.getElementById("curtidas2").innerHTML=`${likes2}curtidas`;

likes2++
}

function like3() {
    document.getElementById("btn-curtir3").style.backgroundColor = "#ccc";
    document.getElementById("curtidas3").innerHTML=`${likes3}curtidas`;

likes3++
}
