package contracts.beer.rest

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request {
		description("""
Represents a successful scenario of getting a beer

given:
	client is old enough
when:
	he applies for a beer
then:
	we'll grant him the beer
""")
		method 'POST'
		url '/check'
		body(
				age: 21
		)
		headers {
			contentType(applicationJson())
		}
	}
	response {
		status 200
		body("""
			{
				"status": "OK"
			}
			""")
		headers {
			contentType(applicationJson())
		}
	}
}
