package org.hyrical.store.serializers.impl

import com.google.gson.GsonBuilder
import com.google.gson.LongSerializationPolicy
import org.hyrical.store.serializers.Serializer

class GsonSerializer : Serializer() {
    val gson = GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create()

    override fun <T> deserialize(json: String, type: Class<T>): T? {
        return gson.fromJson(json, type)
    }

    override fun <T> serialize(obj: T): String? {
        return gson.toJson(obj)
    }

}