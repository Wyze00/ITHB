// Toogle visual

const headerVisual = document.querySelector(".header-visual");


headerVisual.addEventListener('click',() => {

    const first = headerVisual.children[1];
    const second = headerVisual.children[2];
    const image = document.querySelector('.header-image-content');

    if(first.classList.contains('blue')){
        image.src = "src/header/hero-characters.webp";
    
    } else {
        image.src = "src/header/kv-pc-l.webp";
    }

    first.classList.toggle('blue');
    second.classList.toggle('blue');

})

// Menambah Special Icons

const specialIcon = document.querySelector(".special-icon-container");

for(let i = 1; i<=13; i++){

    const img = document.createElement('img');

    img.src = `src/special/icon/special-${i}.jpg`;
    img.alt = `Character ${i}`
    img.width = "200";
    img.classList.add('special-image');
    specialIcon.appendChild(img);
}

// Menambah Special Light Novel

const specialLightnovel = document.querySelector(".special-lightnovel-container");

for(let i = 1; i<=6; i++){

    const img = document.createElement('img');

    img.src = `src/special/lightnovel/ln-${i}.webp`;
    img.alt = `Volume ${i}`;
    img.width = "200";
    img.classList.add('special-image');
    specialLightnovel.appendChild(img);
}

// Menambah Special Manga

const specialManga = document.querySelector(".special-manga-container");

for(let i = 1; i<=13; i++){

    const img = document.createElement('img');

    img.src = `src/special/manga/manga-${i}.webp`;
    img.alt = `Volume ${i}`;
    img.width = "200";
    img.classList.add('special-image');
    specialManga.appendChild(img);
}

// Menambah Special Anime

const specialAnime = document.querySelector(".special-anime-container");

for(let i = 1; i<=3; i++){

    const img = document.createElement('img');

    img.src = `src/special/anime/anime-${i}.webp`;
    img.alt = `Volume ${i}`;
    img.width = "200";
    img.classList.add('special-image');
    specialAnime.appendChild(img);
}

// Menambah Special Blueray

const speciaBlueray = document.querySelector(".special-blueray-container");

for(let i = 1; i<=4; i++){

    const img = document.createElement('img');

    img.src = `src/special/blueray/blueray-${i}.webp`;
    img.alt = `Volume ${i}`;
    img.width = "200";
    
    img.classList.add('special-image');
    speciaBlueray.appendChild(img);
}

// Character

const character = [];

character.push({name: 'Shadow', cv: 'Seiichiro Yamada'});
character.push({name: 'Cid', cv: 'Seiichiro Yamada'});
character.push({name: 'Alpha', cv: 'Asami Seto'});
character.push({name: 'Beta', cv: 'Inori Minase'});
character.push({name: 'Gamma', cv: 'Suzuko Mimori'});
character.push({name: 'Delta', cv: 'Fairouz Ai'});
character.push({name: 'Epsilon', cv: 'Hisako Kanemoto'});
character.push({name: 'Zeta', cv: 'Reina Kondo'});
character.push({name: 'Eta', cv: 'Ayasaka Asai'});
character.push({name: 'Nu', cv: 'Maaya Uchida'});
character.push({name: 'Alexia', cv: 'Kana Hanazawa'});
character.push({name: 'Claire', cv: 'Rina Hidaka'});
character.push({name: 'Iris', cv: 'Yoko Hisaka'});
character.push({name: 'Rose', cv: 'Haruka Shiraisi'});
character.push({name: 'Sherry', cv: 'Saya Aizawa'});

let i = 0;

// Button Next

const btnNext = document.querySelector('.character-btn-next');

btnNext.addEventListener('click',() => {

    i++;

    if(i > 14){i = 0;}
    if(i < 0){i = 14;}

    const char = character[i];

    replace(char.name,char.cv,i);
    choose(i);
    
}) 

// Button Prev

const btnPrev = document.querySelector('.character-btn-prev')

btnPrev.addEventListener('click',() => {

    i--;

    if(i > 14){i = 0;}
    if(i < 0){i = 14;}

    const char = character[i];

    replace(char.name,char.cv,i);
    choose(i);

}) 

// Mengganti Character

function replace(name,cv,i){

    const characterInfo = document.querySelector('.character-info');

    characterInfo.innerHTML = `<h1>${name}</h1>
                               <img src="src/character/text-deco.webp" alt="">
                               <p>Cv. ${cv}</p>`;

    const characterImage = document.querySelector('.character-image');

    characterImage.style.backgroundImage = `url("../src/character/bg-adult/bg-${i+1}.webp")`;
}

// Character Choose

const characterChoose = document.querySelector('.character-choose');

function choose(i){

    if(i > 8){
        characterChoose.style.visibility = "hidden";

        return;
    } else {
        characterChoose.style.visibility = "visible";
    }
}