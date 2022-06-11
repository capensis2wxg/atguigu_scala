package com.capensis.chapter15projectPractice.customercrm.app

import com.capensis.chapter15projectPractice.customercrm.view.CustomerView

object CustomerCrm {
  def main(args: Array[String]): Unit = {
    new CustomerView().mainMenu()
  }
}
