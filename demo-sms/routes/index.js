var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function (req, res, next) {
    res.render('index');
});
router.get('/login', function (req, res, next) {
    res.render('index');
});
router.get('/page/home', function (req, res, next) {
    res.render('index');
});
router.get('/page/management-store', function (req, res, next) {
    res.render('index');
});
router.get('/page/product', function (req, res, next) {
    res.render('index');
});
module.exports = router;
