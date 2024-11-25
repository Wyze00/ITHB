function soalLima(){

    const hasil = document.getElementById('soal5_hasil');
    const arr = [1,2,3,4,5,6,7,8,9,10];
    let res = '';

    arr.forEach((e) => {
        res += e + " ";
    })

    hasil.innerHTML = res;
}

soalLima();