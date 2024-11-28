(function soal3(){
    const button = document.getElementById('soal3-button');
    const result = document.querySelector('.soal3-result');

    button.addEventListener('click', () => {

        const panjang = prompt("Masukkan mau berapa faktorial");
        let res = `<table border="1" style="border-collapse: collapse;">
                        <tr>
                            <th>Angka</th>
                            <th>Hasil</th>
                        </tr>\n`


        for(let i = 1; i<=panjang; i++){
            res += `<tr>
                        <td>!${i}</td>
                        <td>${factorial(i)}</td>
                    </tr>\n`
        }

        res += `</table>`;

        result.innerHTML = res;
    })

    function factorial(n) {
        if(n == 1){return 1}
        return n * factorial(n-1);
    }
})();