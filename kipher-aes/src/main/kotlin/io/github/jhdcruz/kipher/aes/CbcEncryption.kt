/*
 * Copyright 2023 Joshua Hero Dela Cruz
 * SPDX-License-Identifier: Apache-2.0
 */

package io.github.jhdcruz.kipher.aes

/**
 * AES Encryption using CBC mode using PKCS5 Padding.
 *
 * `PKCS5` and `PKCS7` are [interchangeable](https://stackoverflow.com/a/53139355/16171990) in
 * SunJCE Provider.
 *
 * To support most use-cases, all returned data are raw [ByteArray]s instead of [String]s.
 */
class CbcEncryption : BasicEncryption(AesModes.CBC)
