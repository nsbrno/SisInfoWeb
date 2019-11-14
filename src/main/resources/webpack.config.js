/*
 * Document   : webpack.config
 * Created on : 27/10/2019, 17:45:53
 * Author     : Bruno Nogueira Silva
 */
const path = require("path");
const webpack = require("webpack");
const VueLoaderPlugin = require("vue-loader/lib/plugin");
const HtmlWebpackPlugin = require("html-webpack-plugin");
const VuetifyLoaderPlugin = require("vuetify-loader/lib/plugin");

module.exports = {
  devtool: "source-map",
  entry: ['@babel/polyfill', path.resolve(__dirname, "./public/index.js")],
  output: {
    path: path.resolve(__dirname, "./public"),
    filename: "bundle.js"
  },
  module: {
    rules: [
      {
        test: /\.tsx?$/,
        use: "ts-loader",
        exclude: /node_modules/
      },
      {
        test: /\.vue$/,
        loader: "vue-loader"
      },
      {
        test: /\.m?js$/,
        exclude: /node_modules/,
        use: {
          loader: "babel-loader",
          options: {
            presets: ["@babel/preset-env"],
            plugins: ['@babel/plugin-transform-runtime']
          }
        }
      },
      {
        test: /\.(sa|sc|c)ss$/,
        //exclude: /node_modules/,
        use: [
          "vue-style-loader",
          "css-loader",
          {
            loader: "sass-loader"
            // Requires sass-loader@^8.0.0
            /**options: {
                         implementation: require('sass'),
                         sassOptions: {
                         fiber: require('fibers'),
                         indentedSyntax: true // optional
                         },
                         },*/
          }
        ]
      },
      {
        test: /\.(png|jpe?g|gif|svg|woff|woff2|ttf|eot|ico)$/,
        use: [
          {
            loader: "url-loader",
            options: {
              limit: 8192,
              name: '[name].[ext]'
            }
          }
        ]
      }
    ]
  },
  resolve: {
    extensions: [".tsx", ".ts", ".js", ".min.js", ".vue", ".css", ".scss"],
    // Adicionar aqui os camhinhos para o webpack achar cada arquivo
    alias: {
      vue$: path.resolve(__dirname, "./node_modules/vue/dist/vue.esm.js")
    },
    modules: ["./node_modules", "node_modules"]
  },
  devServer: {
    //open: true,
    open: "chrome",
    hot: true,
    historyApiFallback: true
  },
  plugins: [
    new HtmlWebpackPlugin({
      template: path.resolve(__dirname, "./public/index.html"),
      inject: false,
      favicon: "./public/assets/icon/favicon.png"
    }),
    new VueLoaderPlugin(),
    new webpack.HotModuleReplacementPlugin(),
    new VuetifyLoaderPlugin()
  ]
};
