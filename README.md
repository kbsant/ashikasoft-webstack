# ashikasoft-webstack

[![Clojars Project](https://img.shields.io/clojars/v/ashikasoft/webstack.svg)](https://clojars.org/ashikasoft/webstack)

A Clojure-based web stack

## What's this
This is a clojure library that groups together common dependencies for a web stack.

## Why is this needed
Reasons for having the web stack as a library:
* Putting common web dependencies in a package makes it easier to upgrade projects.
* Having the web stack as a library rather than a framework gives projects more flexibility in terms of structure. This approach is inspired by various talks on clean architecture -- a web stack is simply a dependency and need not dictate the overall organisation of the project.

## What's in here
The main items are:
* Immutant web server (via Luminus)
* Ring request handler
* Reitit router
* Hiccup rendering
* Integrant component management

