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


// ===============================
// VIEW CART
// ===============================
function viewCart() {

    let cart = JSON.parse(localStorage.getItem("cart")) || [];

    if (cart.length === 0) {
        alert("🛒 Your cart is empty!");
        return;
    }

    let message = "===== YOUR CART =====\n\n";
    let grandTotal = 0;

    cart.forEach((product, index) => {

        let total = product.price * product.quantity;

        message += (index + 1) + ". " + product.name + "\n";
        message += "   Quantity: " + product.quantity + "\n";
        message += "   Price: ₹" + product.price + "\n";
        message += "   Total: ₹" + total + "\n\n";

        grandTotal += total;
    });

    message += "----------------------\n";
    message += "Grand Total: ₹" + grandTotal;

    alert(message);
}


// ===============================
// REMOVE CART ITEM
// ===============================
function removeFromCart(productName) {

    let cart = JSON.parse(localStorage.getItem("cart")) || [];

    cart = cart.filter(product => product.name !== productName);

    localStorage.setItem("cart", JSON.stringify(cart));

    alert("❌ " + productName + " removed from cart!");
}
function removeSelectedProduct() {

    let productName = prompt(
        "Enter product name to remove:\nLaptop\nMobile\nHeadphones"
    );

    if (productName === null) {
        return;
    }

    removeFromCart(productName);
}


// ===============================
// REVIEW CART
// ===============================
function reviewCart() {

    let cart = JSON.parse(localStorage.getItem("cart")) || [];

    if (cart.length === 0) {
        alert("🛒 Cart is empty!");
        return;
    }

    let total = 0;

    cart.forEach(product => {
        total += product.price * product.quantity;
    });

    alert(
        "📝 CART REVIEW\n\n" +
        "Items: " + cart.length + "\n" +
        "Total Amount: ₹" + total + "\n\n" +
        "Your cart is ready for checkout!"
    );
}


// ===============================
// EXIT
// ===============================
function exitApp() {

    let confirmExit = confirm(
        "Are you sure you want to exit?"
    );

    if (confirmExit) {
        window.location.href = "index.html";
    }
}