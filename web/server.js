const express = require('express');
const app = express();
const port = 3000;
const path = require('path');
const MongoClient = require('mongodb').MongoClient;

const mongoUrl = 'mongodb+srv://mani:mani123@cluster0.soorsak.mongodb.net/?retryWrites=true&w=majority'; // Replace with your MongoDB connection URL
const dbName = 'webappshop'; // Replace with your database name

app.use(express.static(path.join(__dirname, 'public')));
app.set('view engine', 'ejs');

// Connect to the MongoDB database
MongoClient.connect(mongoUrl, { useNewUrlParser: true, useUnifiedTopology: true }, (err, client) => {
  if (err) {
    console.error('Error connecting to MongoDB:', err);
    return;
  }

  console.log('Connected to MongoDB successfully');
  const db = client.db(dbname);
  const productsCollection = db.collection('products');

  // Render the index page with product data from the database
  app.get('/', (req, res) => {
    // Fetch product data from the database
    productsCollection.find().toArray((err, products) => {
      if (err) {
        console.error('Error fetching product data:', err);
        return;
      }

      // Render the index page and pass the product data to the frontend
      res.render('index', { products });
    });
  });

  app.get('/sell', (req, res) => {
    // Fetch product data from the database
    productsCollection.find().toArray((err, products) => {
      if (err) {
        console.error('Error fetching product data:', err);
        return;
      }

      // Render the index page and pass the product data to the frontend
      res.render('seller', { products });
    });
  });

  // Start the server
  app.listen(port, () => {
    console.log(`Server running on http://localhost:${port}`);
  });
});
