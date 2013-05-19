package com.github.ogagi.thebaptist

import org.scalatra._
import scalate.ScalateSupport

class BaptistServlet extends TheBaptistStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
