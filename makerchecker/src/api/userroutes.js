const express = require('express');
const router = express.Router();

const User = require('../api/userdt');

// register - /users/register
router.get('/register', (req, res) => {
res.send("test register route")
});

// register - /users/register
router.post('/register', (req, res, next) => {
    console.log("/register");
    let newUser = new User({
      name: req.body.name,
      email: req.body.email,
      username: req.body.username,
      password: req.body.password
    });

    User.addUser(newUser, (err, user) => {
        if(err){
          res.json({success: false, msg: 'Failed to register user'});
        } else {
          res.json({success: true, msg: 'User registered'});
        }
      });
});

module.exports = router;
