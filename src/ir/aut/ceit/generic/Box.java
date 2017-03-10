package ir.aut.ceit.generic;

import java.util.Comparator;

/*
* Copyright 2017 Amir Hadifar.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* 
*/
public class Box implements Comparable<Box> {
    private int value;


    @Override
    public int compareTo(Box o) {
        if (value == o.value)
            return 0;
        else if (value > o.value) {
            return 1;
        } else {
            return -1;
        }
    }
}
