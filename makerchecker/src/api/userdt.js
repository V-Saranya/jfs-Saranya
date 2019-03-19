//Mongoose is an Object Data Modeling (ODM) library for MongoDB and Node.js
const mongoose = require('mongoose');
//for encrypting the password
const bcrypt = require('bcryptjs');
const Schema = mongoose.Schema;
//const dbconfig = require('../config/database');

// Create Schema
const UserSchema = new Schema({
  name: {
    type: String
  },
  email: {
    type: String,
    required: true
  },
  username: {
    type: String,
    required: true
  },
  password: {
    type: String,
    required: true
  }
});

// module.exports so that it can be used outside this file
const User = (module.exports = mongoose.model('User', UserSchema));

module.exports.getUserById = function(id, callback) {
  User.findById(id, callback);
};

module.exports.getUserByUsername = function(username, callback) {
  const query = { username: username };
  User.findOne(query, callback);
};

module.exports.addUser = function(newUser, callback){
  bcrypt.genSalt(10, (err, salt) => {
    bcrypt.hash(newUser.password, salt, (err, hash) => {
      // Store hash in the password DB
      if(err) throw err;
      newUser.password = hash;
      newUser.save(callback);
    });
  });
}
