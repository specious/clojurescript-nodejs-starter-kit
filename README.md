[NodeJS](https://github.com/nodejs/node) application via [ClojureScript](https://github.com/clojure/clojurescript) using [Boot](https://github.com/boot-clj/boot) quickstarter kit.

## Usage

Install [Boot](http://boot-clj.com/) and get started:

```
boot dev
```

To run the compiled program:

```
cd target
node main.js
```

This [article](https://specious.github.io/blog/2016/12/07/Starting-a-NodeJS-app-with-ClojureScript-and-Boot/) explains everything in detail.

## Debugging with source maps

```
cd target
node --inspect-brk main.js
```

Now you can use the Node inspector in the Chrome Browser to step through and debug your application at runtime.

## License

ISC
