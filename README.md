# 3waysaur

__We are still at MVP0__ -> not stable and not functional.

3waysaur is a lein plugin with a bold aspiration. We intend this plugin to be secure and developer friendly. This should be accomplished by __security first development_, frequent updates, __OPEN SOURCE__,  and features to be toggled by command line at the beginning of the project.

## Using the plugin
```Clojure
:plugins [[lein-3waysaur "0.1.0-SNAPSHOT"]]
```

## Requirements
* Leiningen 2.7.*
* Java 1.8.*
* Clojure 1.8.*

## Plugin development best practices:
### Emitting Output
To emit outputs do not use `print` commands. Use:
* `leiningen.core.main/info`
* `leiningen.core.main/warn`
* `leiningen.core.main/debug`
