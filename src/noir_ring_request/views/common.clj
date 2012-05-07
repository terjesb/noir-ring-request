(ns noir-ring-request.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "noir-ring-request"]
               ]
              [:body
               [:div#wrapper
                content]]))
