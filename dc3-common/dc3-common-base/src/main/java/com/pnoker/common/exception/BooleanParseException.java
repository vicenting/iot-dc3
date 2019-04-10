/*
 * Copyright 2018 Google LLC. All Rights Reserved.
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
package com.pnoker.common.exception;

/**
 * <p>Copyright(c) 2018. Pnoker All Rights Reserved.
 * <p>Author     : Pnoker
 * <p>Email      : pnokers@gmail.com
 * <p>Description: The class Boolean parse exception.
 */
public class BooleanParseException extends RuntimeException {
    /**
     * Instantiates a new Boolean parse exception.
     */
    public BooleanParseException() {
        super();
    }

    /**
     * Instantiates a new Boolean parse exception.
     *
     * @param message the message
     */
    public BooleanParseException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Boolean parse exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public BooleanParseException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Boolean parse exception.
     *
     * @param cause the cause
     */
    public BooleanParseException(Throwable cause) {
        super(cause);
    }
}
