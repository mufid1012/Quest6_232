package com.example.model_viewmodel.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.res.stringResource
import java.lang.reflect.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(
    pilihanJK: List<String>,
    onSubmitClicked: (MutableList<String>) -> Unit
    modifier: Modifier = Modifier
){
    var txtNama by rememberSaveable { mutableStateOf(value = "") }
    var txtAlamat by rememberSaveable { mutableStateOf(value = "") }
    var txtGender by rememberSaveable { mutableStateOf(value = "") }
    val listData: MutableList<String> = mutableListOf(txtNama, txtGender, txtAlamat)

    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.app_name), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500)
                )
            )
        }
    )


}