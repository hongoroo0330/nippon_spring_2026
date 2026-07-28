const DOG_URL = 'https://dog.ceo/api/breeds/image/random';
const dogContainer = document.querySelector('div');

fetch(DOG_URL)
.then(response => response.json())
.then((data) => {
    const img = document.createElement('img');
    img.src = data.message;

    dogContainer.appendChild(img);
})
.catch((error) => {
    console.log(error);
});
