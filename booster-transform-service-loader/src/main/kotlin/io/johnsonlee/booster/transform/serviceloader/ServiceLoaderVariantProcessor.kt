package io.johnsonlee.booster.transform.serviceloader

import com.android.build.gradle.api.BaseVariant
import com.android.build.gradle.api.LibraryVariant
import com.didiglobal.booster.gradle.project
import com.didiglobal.booster.gradle.variantType
import com.didiglobal.booster.task.spi.VariantProcessor
import com.google.auto.service.AutoService
import io.johnsonlee.spi.service.registry.Build

/**
 * @author johnsonlee
 */
@AutoService(VariantProcessor::class)
class ServiceLoaderVariantProcessor : VariantProcessor {

    override fun process(variant: BaseVariant) {
        if (variant !is LibraryVariant && !variant.variantType.isDynamicFeature) {
            variant.project.dependencies.add(
                "implementation",
                "${Build.GROUP}:${Build.ARTIFACT}:${Build.VERSION}"
            )
        }
    }

}