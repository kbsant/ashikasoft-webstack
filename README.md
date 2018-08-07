# ashikasoft-webstack
A Clojure-based web stack

## What's this
This is a clojure library that groups together common dependencies for a web stack.

## Why is this needed
Reasons for having the web stack as a library:
* Having common web dependencies in a package makes upgrading a project easier.
* Including the web stack as a library rather than a framework gives projects more flexibility. This approach is inspired by various talks on clean architecture -- a web stack is a mere dependency and should not dictate the overall organisation of the project.


## What's in here
The main items are:
* Immutant web server (via Luminus)
* Ring request handler
* Reitit router
* Hiccup rendering
* Integrant component management

