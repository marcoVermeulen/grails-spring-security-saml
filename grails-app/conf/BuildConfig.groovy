grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
	compile ('org.springframework.security.extensions:spring-security-saml2-core:1.0.0-RC1-SNAPSHOT') {
		excludes "xml-apis", "commons-logging","slf4j-api", "jul-to-slf4j"
	}
    }

    plugins {
        build(":tomcat:$grailsVersion",
              ":release:1.0.0.RC3") {
            export = false
        }
    }
}
