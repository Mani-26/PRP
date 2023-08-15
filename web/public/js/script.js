const productContainer = document.querySelector('.product-container');

// Dummy data for product listing
const products = [
  { name: 'Product 1', price: 25, image: 'product1.jpg' },
  { name: 'Product 2', price: 40, image: 'product2.jpg' },
  { name: 'Product 3', price: 15, image: 'product3.jpg' },
  { name: 'Product 1', price: 25, image: 'product1.jpg' },
  { name: 'Product 2', price: 40, image: 'product2.jpg' },
  { name: 'Product 3', price: 15, image: 'product3.jpg' },
  { name: 'Product 1', price: 25, image: 'product1.jpg' },
  { name: 'Product 2', price: 40, image: 'product2.jpg' },
  { name: 'Product 3', price: 15, image: 'product3.jpg' },
    // Add more products with image URLs here
];

// Generate product cards dynamically
products.forEach(product => {
    const productCard = document.createElement('div');
    productCard.classList.add('product-card');
    productCard.innerHTML = `
        <img src="/images/${product.image}" alt="${product.name}">
        <div class="product-name">${product.name}</div>
        <div class="product-price">$${product.price}</div>
    `;
    productContainer.appendChild(productCard);
});
