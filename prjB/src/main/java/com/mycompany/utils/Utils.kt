/*
 * Copyright 2012-2016 Dmitri Pisarenko
 *
 * WWW: http://altruix.cc
 * E-Mail: dp@altruix.co
 * Skype: dp118m (voice calls must be scheduled in advance)
 *
 * Physical address:
 *
 * 4-i Rostovskii pereulok 2/1/20
 * 119121 Moscow
 * Russian Federation
 */

package com.mycompany.utils

import com.mycompany.ValidationResult

fun createCorrectValidationResult(): ValidationResult =
      ValidationResult(true, "")

fun createIncorrectValidationResult(msg:String): ValidationResult =
      ValidationResult(false, msg)
