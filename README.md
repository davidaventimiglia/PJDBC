# README #

### What is this repository for? ###

This project provides PJDBC, the Proxying JDBC driver.  This driver
has a pluggable architecture and allows the introduction of proxies in
order to intercept JDBC calls and transform both the input and the
output.

### How do I get set up? ###

Usage:

	Connection c = (new CatDriver().connect("jdbc:cat:jdbc:mock:foo", null));
	
This example sets up the CatDriver proxying driver, which just
forwards calls to the next driver in the chain.  In this case, that
next driver is a mock, but in practice it would be a real database
driver.  Proxying drivers can be chained in this way, though the last
driver in the chain should be a "real" (i.e., non-proxying) driver
that talks to the actual database.

### Who do I talk to? ###

* David A. Ventimiglia <davidaventimiglia@neptunestation.com>
