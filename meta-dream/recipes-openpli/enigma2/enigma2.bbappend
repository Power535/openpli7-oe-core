FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PYTHON_RDEPS += "\
	python-service-identity \
"

SRC_URI_append_dm800 += "\
    file://e2_old_dvbapi.patch \
    file://fblcd.cpp.patch \
    file://fix-wrong-driver-date.patch \
"

SRC_URI_append_dm8000 += "\
    file://fix-wrong-driver-date.patch \
"

SRC_URI_append_dm7080 += "\
    file://add-support-dm7080.patch \
"

inherit upx_compress