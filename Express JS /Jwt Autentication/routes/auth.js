const express = require("express");

const jwt = require("jsonwebtoken");

const router = express.Router();

 

// dummy user -> later we can fetch from db

const users = [

    {

        id: 1, username: "John", password: "password"

    },

    {

        id: 2, username: "Jacob", password: "pass"

    },

    {

        id: 3, username: "Harry", password: "pass123"

    }

];

 

// user login and it will aithenticate

router.post("/login", (req, res) => {

    const {username, password} = req.body;

    const user = users.find(user => user.username === username && user.password === password);

 

    if(!user){

        return res.sendStatus(401).json({message: "invalid credential"});

    }

 

const token = jwt.sign({sub: user.id}, "mysecretkey");

    res.json({token});

});

 

module.exports = router;