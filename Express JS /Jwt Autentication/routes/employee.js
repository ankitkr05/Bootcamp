const express = require(`express`);
const jwt = require(`jsonwebtoken`);
const router = express.Router();

const employees = [
    {id:1, name:"virat", dept:"gnt", salary:72000},
    {id:2, name:"rohit", dept:"tse", salary:78000},
    {id:3, name:"sachin", dept:"data", salary:85000}
];

// Middleware for token authentication
function authenticateToken(req, res, next){
    const authHeader = req.headers[`authorization`];
    const token = authHeader && authHeader.split(" ")[1];

    if(token == null){
        return res.status(401).json({message: 'Unauthorized user'});
    }

    jwt.verify(token, 'mysecretkey', (err,user) => {
        if(err){
            return res.status(403).json({message: `forbidden`});
        }
        req.user = user;
        next();
    });
}


router.get("/get", authenticateToken, (req,res) => {
    res.json(employees);
});

module.exports = router;