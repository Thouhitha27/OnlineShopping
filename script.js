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

    alert(
        "🛒 " + productName +
        " added to cart!\n\n" +
        "Price: ₹" + price
    );

}