function soalTiga() {

    const celcius = document.getElementById('soal3_text1');
    const farenheit = document.getElementById('soal3_text2');
    const button = document.getElementById('soal3_button');
    const hasil = document.getElementById('soal3_hasil');

    celcius.addEventListener('input', () => {
        farenheit.setAttribute('disabled','true');
    })

    farenheit.addEventListener('input', () => {
        celcius.setAttribute('disabled','true');
    })

    button.addEventListener('click', () => {

        console.log(celcius.value);
        console.log(farenheit.value)

        if(celcius.value) {
            hasil.innerHTML = `Farenheit = ${toFarenheit(celcius.value)} || Celcius = ${celcius.value}`
        } else {
            hasil.innerHTML = `Farenheit = ${farenheit.value} || Celcius = ${toCelcius(farenheit.value)}`
        }

        farenheit.removeAttribute('disabled');
        celcius.removeAttribute('disabled');
        farenheit.value = '';
        celcius.value = ''
    })

    function toFarenheit(celcius){
        return (celcius * 9 / 5) + 32;
    }

    function toCelcius(farenheit){
        return (farenheit - 32) * 5 / 9;
    }

}

soalTiga();