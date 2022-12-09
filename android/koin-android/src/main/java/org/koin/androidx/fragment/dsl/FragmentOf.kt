/*
 * Copyright 2017-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:OptIn(KoinInternalApi::class)

package org.koin.androidx.fragment.dsl

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.annotation.KoinInternalApi
import org.koin.core.definition.BeanDefinition
import org.koin.core.module.KoinDefinition
import org.koin.core.module.Module
import org.koin.core.module._factoryInstanceFactory
import org.koin.core.module.dsl.new
import org.koin.core.module.dsl.setupInstance
import org.koin.core.module.dsl.withOptions

/**
 * Fragment Constructor DSL
 *
 * @author Arnaud Giuliani
 * @see new
 */
inline fun <reified R : Fragment> Module.fragmentOf(
    crossinline constructor: () -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1> Module.fragmentOf(
    crossinline constructor: (T1) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2> Module.fragmentOf(
    crossinline constructor: (T1, T2) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3> Module.fragmentOf(
    crossinline constructor: (T1, T2, T3) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4> Module.fragmentOf(
    crossinline constructor: (T1, T2, T3, T4) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5> Module.fragmentOf(
    crossinline constructor: (T1, T2, T3, T4, T5) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6> Module.fragmentOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7> Module.fragmentOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8> Module.fragmentOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9> Module.fragmentOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10> Module.fragmentOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)

/**
 * @see fragmentOf
 */
inline fun <reified R : Fragment, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> R,
    crossinline options: BeanDefinition<R>.() -> Unit = {},
): KoinDefinition<R> = fragment { new(constructor) }.withOptions(options)