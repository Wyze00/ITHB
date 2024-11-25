function soalEmpat(){

    const angka = document.getElementById('soal4_text1');
    const button = document.getElementById('soal4_button');
    const hasil = document.getElementById('soal4_hasil');

    button.addEventListener('click', () => {

        let text = '';

        for(let i = 1; i<=Number(angka.value); i++){

            if(i % 4 == 0){
                text += `${String(i).padEnd(2," ")}\n`;
            } else {
                text += `${String(i).padEnd(2," ")} `;
            }
        }
        
        angka.value = '';
        hasil.innerHTML = `<pre>${text}</pre>`;
    })
}

soalEmpat();