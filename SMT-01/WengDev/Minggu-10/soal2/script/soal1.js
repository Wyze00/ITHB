(function soal1(){
    const button = document.getElementById('soal1-button');
    const result = document.querySelector('.soal1-result');

    button.addEventListener('click', () => {

        const angka = [];
        let res = '';

        for(let i = 1; i<=3; i++){

            const temp = prompt(`Masukkan angka ke : ${i}`);
            res += `<p>Angka ke ${i} : ${temp}</p>\n`;
            angka.push(temp);
        }

        angka.sort((a,b) => b-a);
        res += `Angka terbesar : ${angka[0]}`;

        result.innerHTML = res;
    })
})();