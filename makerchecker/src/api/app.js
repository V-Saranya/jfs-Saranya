const express = require('express');
const path = require('path');
const bodyParser = require('body-parser');
const cors = require('cors');
// const passport = require('passport');
const mongoose = require('mongoose');
const dbconfig = require('../api/db');

//connect to db
mongoose.connect(dbconfig.database);

//handling connected event emitted by EventEmitter
mongoose.connection.on('connected', () => {
  console.log('Connected to MongoDB : ' + dbconfig.database);
});

//handling error event emitted by EventEmitter
mongoose.connection.on('error', (error) => {
    console.log('Error connecting to MongoDB : ' + dbconfig.database + ' : ' + error);
});

//initialize the app
const app = express();

// Load routes
const users = require('../api/userroutes');

//configure port for express
const port = 3000;

// CORS Middleware
app.use(cors());

// Body-Parser Middleware
//   to access req.body and get the form value
app.use(bodyParser.json());

// Static Folder
app.use(express.static(path.join(__dirname, 'public')));

// Use routes
app.use('/users', users);

//configure route for index
app.get('/', (req, res) => {
  res.send('The index endpoint');
});

//start the server
app.listen(port, () => {
  console.log(`Server started on port ${port}`);
});
