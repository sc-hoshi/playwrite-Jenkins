job('NodeJS Job') {
    scm {
        git('https://github.com/sc-hoshi/playwrite-Jenkins.git') {  node ->
            node / gitConfigName('sc-hoshi')
            node / gitConfigEmail('hoshi.ryuto@showcase-tv.com')
        }
    }
    wrappers {
        nodejs('nodejs_v16.17')
    }
    steps {
        shell("npm install")
        shell("npx playwright test")
    }
}