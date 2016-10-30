
var HOST = 'http://localhost:8080';

var agent = require('supertest').agent(HOST);
var assert = require('assert');


describe('Simple API test', function() {

    it('Hello', function(done) {
        var req = 'World';

        agent.post('/api/hello')
            .expect(200)
            .set('Content-Type', 'text/plain')
            .send(req)
            .end((err, res) => {
                assert.equal("Hello " + req, res.text);
                done();
            });
    });
});