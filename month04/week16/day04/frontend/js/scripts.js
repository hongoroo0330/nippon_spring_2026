const mainElement = document.querySelector('main');

const menuUlElement = document.createElement('ul');

const liElementCollection = ['Home', 'FIFA2026', 'Policy', 'Ecomony', 'Society', 'Health']


menuUlElement.classList.add('menu');

for (let i = 0; i < liElementCollection.length; i++) {
    const liElement = document.createElement('li');
    liElement.innerText = liElementCollection[i];
    liElement.classList.add('sub-menu');

    menuUlElement.appendChild(liElement);
}
console.log(menuUlElement);

mainElement.appendChild(menuUlElement);
const asideButton = document.createElement('button');
asideButton.textContent = 'Aside add';

mainElement.appendChild(asideButton);

asideButton.addEventListener('click', () => {
    const asideElement = document.createElement('aside');

    const existingAsideElement = mainElement.querySelector('aside.aside');

    if (!existingAsideElement) {
        const asideElement = document.createElement("aside");
        asideElement.classList.add("aside");
        asideElement.textContent = "Aside Menu";
        mainElement.appendChild(asideElement);
    } else {
        mainElement.removeChild(existingAsideElement);
    }
});
mainElement.appendChild(asideButton);


const articleElement = document.createElement('article');
articleElement.classList.add('article');
mainElement.appendChild(articleElement);
