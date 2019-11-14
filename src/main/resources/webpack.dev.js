const merge = require("webpack-merge");
const commonConfig = require("./webpack.common");
const path = require("path");

module.exports = merge(commonConfig, {
  mode: "development",
  devtool: "inline-source-map",
  entry: ['@babel/polyfill', path.resolve(__dirname, "./public/index.js")],
  output: {
    filename: "bundle.js",
    path: path.resolve(__dirname, "./public")
  }
});
