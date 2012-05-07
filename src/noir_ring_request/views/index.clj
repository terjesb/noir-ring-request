(ns noir-ring-request.views.index
  (:require [noir-ring-request.views.common :as common]
            [noir.request :as req])
  (:use [noir.core :only [defpage defpartial]]
        [noir.response :only [redirect]]
        [hiccup.core :only [html]]
        [hiccup.element :only [link-to]]))

(defpage "/" {}
  (common/layout
  [:p req/ring-request]
  [:p (map? req/ring-request)]))
