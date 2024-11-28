(function soal2(){
    const button = document.getElementById('soal2-button');
    const result = document.querySelector('.soal2-result');

    button.addEventListener('click', () => {

        const angka = []
        const panjang = prompt("Masukkan panjang array");

        for(let i = 0; i<panjang; i++){
            angka.push(prompt(`Masukkan angka ke ${i+1}`));
        }

        if(angka.includes(prompt("Masukkan angka yang dicari"))){
            result.innerHTML = 'Angka ada';
        } else {
            result.innerHTML = 'Angka tidak ada';
        }
    })
})();