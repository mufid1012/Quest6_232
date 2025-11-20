package com.example.model_viewmodel.view
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.example.model_viewmodel.R
import com.example.model_viewmodel.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUiSiswa: Siswa,
    onBackButtonClicked: () -> Unit
) {
    val items = listOf(
        Pair(stringResource(id = R.string.nama), statusUiSiswa.nama),
        Pair(stringResource(id = R.string.gender), statusUiSiswa.gender),
        Pair(stringResource(id = R.string.alamat), statusUiSiswa.alamat)
    )
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.detail),
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500)
                )
            )
        }
    ){ isiRuang ->

        Column(
            modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Column(
                modifier = Modifier.padding(all = 16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {

                items.forEach { item ->
                    Column {
                        Text(
                            text = item.first.uppercase(),
                            fontSize = 16.sp
                        )
                        Text(
                            text = item.second,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    }
                    Divider(thickness = 1.dp)
                }
            }
            Spacer(modifier = Modifier.height(10.dp))

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = onBackButtonClicked
            ) {
                Text(text = stringResource(id = R.string.back))
            }

        }
    }

}