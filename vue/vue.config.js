const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  outputDir: '../src/main/resources/static',
  devServer: {
    proxy: 'http://localhost:9090',
  },
  transpileDependencies: true,
})
