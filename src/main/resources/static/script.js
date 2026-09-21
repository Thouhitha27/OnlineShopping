// Login function
function login(event) {
    event.preventDefault();
    window.location.href = "home.html";
}

// Shop Now button
function shopNow() {
    document.querySelector(".products").scrollIntoView({
        behavior: "smooth"
    });
}

// Add to Cart function
function addToCart(productName, price) {

    let cart = JSON.parse(localStorage.getItem("cart")) || [];

    let existingProduct = cart.find(product => product.name === productName);

    if (existingProduct) {
        existingProduct.quantity++;
    } else {
        cart.push({
            name: productName,
            price: price,
            quantity: 1
        });
    }

    localStorage.setItem("cart", JSON.stringify(cart));

    alert("🛒 " + productName + " added to cart!");
}