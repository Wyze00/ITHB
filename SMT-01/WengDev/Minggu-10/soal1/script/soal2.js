function soalDua(){

    const button = document.getElementById('soal2_button');

    button.addEventListener('click', () => {

        const text1 = document.getElementById('soal2_text1');
        const text2 = document.getElementById('soal2_text2');
        const hasil = document.getElementById('soal2_hasil');
    
        if(Number(text1.value) > Number(text2.value)) {
            hasil.innerHTML = `Angka lebih besar ${text1.value}`;
        } else {
            hasil.innerHTML = `Angka lebih besar ${text2.value}`;
        }

        text1.value = '';
        text2.value = '';
    })
}

soalDua();