# JBang Presentation Script

## Cleanup

```shell
rm -rf jbang-demo
mkdir jbang-demo
cd jbang-demo

jbang app uninstall jgit
jbang app uninstall wut
jbang app uninstall wtf
```

## JBang Script Examples

```shell
jbang init demo.java
jbang edit . demo.java
jbang demo.java
```

## JBang Script with Dependencies

```java
//DEPS org.apache.commons:commons-text:1.13.1

out.println( StringSubstitutor.replaceSystemProperties(  "You are running with java.version = ${java.version} and os.name = ${os.name}." ) );
```

## JBang Run

```shell
cd
jbang jbang-demo/demo.java

# From url
jbang https://gist.github.com/robintegg-createfuture/0810081f050e951f1b1dc800c1e44306
```

https://github.com/robintegg-createfuture/jbang-demo

```shell
# From github
jbang https://github.com/robintegg-createfuture/jbang-demo/blob/main/jbang-url/jbangurl.java
```

### Run jar

https://github.com/chirontt/jgit.pgm.native/blob/main/README.md

Using maven coords

https://mvnrepository.com/artifact/org.eclipse.jgit/org.eclipse.jgit.pgm/7.3.0.202506031305-r

```shell
jbang org.eclipse.jgit:org.eclipse.jgit.pgm:7.3.0.202506031305-r version
```

## Install apps

```shell
jbang app install --name jgit org.eclipse.jgit:org.eclipse.jgit.pgm:7.3.0.202506031305-r
jbang app install --name wut https://gist.github.com/robintegg-createfuture/0810081f050e951f1b1dc800c1e44306
jbang app list
```

##  JBang Catalog

https://github.com/jbangdev/jbang-catalog/blob/main/jbang-catalog.json
https://github.com/robintegg-createfuture/jbang-demo/blob/main/jbang-catalog.json

```shell
jbang catalog add --name demo https://github.com/robintegg-createfuture/jbang-demo/blob/main/jbang-catalog.json
jbang alias list demo

jbang run jbang-url@demo
jbang app install --name wtf jbang-url@demo
```

## Extra

### Link to git sources

https://github.com/robintegg-createfuture/jbang-demo/blob/main/jbang-nobuild/jbangnobuild.java
https://jitpack.io/#robintegg-createfuture/jbang-demo

```shell
jbang run jbangnobuild@demo
```