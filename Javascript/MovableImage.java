const image = document.getElementById('MovableImage');
let isDragging = false;
let offsetX, offsetY;

// Début du déplacement
image.addEventListener('mousedown', (e) => {
        isDragging = true;
        offsetX = e.offsetX;
        offsetY = e.offsetY;
        image.style.cursor = 'grabbing';
});

// Déplacement de l'image
document.addEventListener('mousemove', (e) => {
    if (isDragging) {
        image.style.left = `${e.pageX - offsetX}px`;
        image.style.top = `${e.pageY - offsetY}px`;
    }
});

// Fin du déplacement
document.addEventListener('mouseup', () => {
    isDragging = false;
    image.style.cursor = 'grab';
});





