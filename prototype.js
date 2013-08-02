var express = require('express');
var app = express();
var http = require('http');
var path = require('path');

app.configure(function () {
  app.use(express.static(path.join(__dirname, './src/main/webapp')));
  app.use(app.router);
});

var server = http.createServer(app);

server.listen(7777);