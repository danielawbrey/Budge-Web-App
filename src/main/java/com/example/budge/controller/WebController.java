package com.example.budge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

        @RequestMapping("/budget")
        public String getBudgetPage() {
            return "budget-main.html";
        }

        @RequestMapping("/coupon")
        public String getCouponPage() {
            return "coupon-main.html";
        }
}
