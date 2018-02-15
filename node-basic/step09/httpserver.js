const http = require('http');

const server = http.createServer(function(req, resp) {
    resp.writeHead(
            '200', 
            {
            'Content-Type':'text/plain;charset=UTF-8',
            'Access-Control-Allow-Origin':'*'
            })
    resp.write("hello!");
    
    setTimeout(function() {
    	resp.end();
    }, 3000);
});

server.listen(8888, function(){
    console.log("서버 실행 중...");
});